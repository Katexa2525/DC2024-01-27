﻿using Publisher.Data;
using Publisher.Models;
using Publisher.Repositories.Interfaces;

namespace Publisher.Repositories.Implementations;

public class CreatorSqlRepository(AppDbContext context) : BaseSqlRepository<Creator>(context), ICreatorRepository
{
}