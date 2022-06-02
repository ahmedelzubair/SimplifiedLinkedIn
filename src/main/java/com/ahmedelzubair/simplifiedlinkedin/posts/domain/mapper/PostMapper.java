package com.ahmedelzubair.simplifiedlinkedin.posts.domain.mapper;

import com.ahmedelzubair.simplifiedlinkedin.posts.domain.CommentReaction;
import com.ahmedelzubair.simplifiedlinkedin.posts.domain.Post;
import com.ahmedelzubair.simplifiedlinkedin.posts.domain.PostComment;
import com.ahmedelzubair.simplifiedlinkedin.posts.domain.dto.CommentReactionDTO;
import com.ahmedelzubair.simplifiedlinkedin.posts.domain.dto.PostCommentDTO;
import com.ahmedelzubair.simplifiedlinkedin.posts.domain.dto.PostDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PostMapper {

    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    PostDTO mapToDTO(Post post);

    Post mapToEntity(PostDTO postDTO);

    PostCommentDTO mapToDTO(PostComment postComment);

    PostComment mapToEntity(PostCommentDTO postCommentDTO);

    CommentReactionDTO mapToDTO(CommentReaction commentReaction);

    CommentReaction mapToEntity(CommentReactionDTO commentReactionDTO);


}
