package sx.blah.discord.api.internal.json.responses;

/**
 * The extended invite response received from creating an invite.
 * TODO: Try to add support for extra data in java, for some reason this is only accessible when creating and retrieving the invite
 */
public class ExtendedInviteResponse extends InviteJSONResponse {

	/**
	 * The time (in seconds) the invite lasts for
	 */
	public long max_age;

	/**
	 * Whether the invite has been revoked
	 */
	public boolean revoked;

	/**
	 * The time and date the invite was created
	 */
	public String created_at;

	/**
	 * Whether the invite only temporarily accepts a user
	 */
	public boolean temporary;

	/**
	 * The current number of uses of the invite
	 */
	public int uses;

	/**
	 * The maximum amount of times this invite can accept a user
	 */
	public int max_uses;

	/**
	 * The user who created this invite
	 */
	public UserResponse inviter;
}
