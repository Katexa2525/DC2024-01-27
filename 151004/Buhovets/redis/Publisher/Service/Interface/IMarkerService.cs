﻿using Publisher.Entity.Db;
using Publisher.Entity.DTO.RequestTO;
using Publisher.Entity.DTO.ResponseTO;
using Publisher.Service.Interface.Common;

namespace Publisher.Service.Interface
{
    public interface ITagService : ICrudService<Tag, TagRequestTO, TagResponseTO>
    {
        Task<IList<TagResponseTO>> GetByTweetID(int tweetId);
    }
}
