package org.politaktiv.communityselect.domain;

import org.politaktiv.community.domain.AddCommunitiesRepository;
import org.politaktiv.community.domain.MainCommunitiesRepository;
import org.politaktiv.community.domain.RemoveCommunitiesRepository;

public interface CommunitiesRepository extends AddCommunitiesRepository, RemoveCommunitiesRepository, MainCommunitiesRepository{

}
