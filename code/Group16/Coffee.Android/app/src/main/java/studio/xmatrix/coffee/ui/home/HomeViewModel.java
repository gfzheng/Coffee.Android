package studio.xmatrix.coffee.ui.home;

import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import studio.xmatrix.coffee.App;
import studio.xmatrix.coffee.data.common.network.Resource;
import studio.xmatrix.coffee.data.repository.ContentRepository;
import studio.xmatrix.coffee.data.repository.LikeRepository;
import studio.xmatrix.coffee.data.service.LikeService;
import studio.xmatrix.coffee.data.service.resource.CommonResource;
import studio.xmatrix.coffee.data.service.resource.LikeResource;

import javax.inject.Inject;

public class HomeViewModel extends AndroidViewModel {

    private ContentRepository contentRepository;
    private LikeRepository likeRepository;

    @Inject
    HomeViewModel(App app, ContentRepository contentRepository, LikeRepository likeRepository) {
        super(app);
        this.contentRepository = contentRepository;
        this.likeRepository = likeRepository;
    }

    LiveData<Resource<LikeResource>> getLikes() {
        return likeRepository.getLikes();
    }

    LiveData<Resource<CommonResource>> like(String id, LikeService.LikeType type) {
        return likeRepository.likeById(id, type);
    }

    LiveData<Resource<CommonResource>> unlike(String id,LikeService.LikeType type) {
        return likeRepository.unlikeById(id, type);
    }
}
