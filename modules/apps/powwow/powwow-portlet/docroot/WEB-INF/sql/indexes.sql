create index IX_A9E3FA50 on PowwowMeeting (groupId);
create index IX_D0423BF3 on PowwowMeeting (powwowServerId);
create index IX_790AD7D9 on PowwowMeeting (powwowServerId, status);
create index IX_B1C56C80 on PowwowMeeting (status);
create index IX_ADD9B0BA on PowwowMeeting (userId, status);

create index IX_2CB7C2CD on PowwowParticipant (powwowMeetingId);
create unique index IX_E73754B9 on PowwowParticipant (powwowMeetingId, emailAddress);
create index IX_ECA316DC on PowwowParticipant (powwowMeetingId, participantUserId);
create index IX_CFEF5668 on PowwowParticipant (powwowMeetingId, type_);

create index IX_381E5639 on PowwowServer (active_);
create index IX_39D6051A on PowwowServer (providerType, active_);