package cn.itrip.service.comment;

import cn.itrip.beans.pojo.ItripComment;

import java.util.List;
import java.util.Map;

import cn.itrip.beans.pojo.ItripImage;
import cn.itrip.beans.vo.comment.ItripScoreCommentVO;
import cn.itrip.beans.vo.comment.ItripListCommentVO;
import cn.itrip.common.Page;

/**
 * Created by shang-pc on 2015/11/7.
 */
public interface ItripCommentService {
    /**
     * 根据酒店的id查询并计算所有点评的位置、设施、服务、卫生和综合评分-add by donghai
     *
     * @param hotelId 酒店的id
     */
    public ItripScoreCommentVO getAvgAndTotalScore(Long hotelId) throws Exception;


    public Integer getItripCommentCountByMap(Map<String, Object> param) throws Exception;


    public Page<ItripListCommentVO> queryItripCommentPageByMap(Map<String, Object> param, Integer pageNo, Integer pageSize) throws Exception;


    /**
     * 新增评论
     * @throws Exception
     */
    public boolean itriptxAddItripComment(ItripComment obj, List<ItripImage> itripImages)throws Exception;



}
