// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserGroupState extends io.pulumi.resources.ResourceArgs {

    public static final UserGroupState Empty = new UserGroupState();

    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The current supported value is `REDIS`.
     * 
     */
    @InputImport(name="engine")
      private final @Nullable Input<String> engine;

    public Input<String> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The ID of the user group.
     * 
     */
    @InputImport(name="userGroupId")
      private final @Nullable Input<String> userGroupId;

    public Input<String> getUserGroupId() {
        return this.userGroupId == null ? Input.empty() : this.userGroupId;
    }

    /**
     * The list of user IDs that belong to the user group.
     * 
     */
    @InputImport(name="userIds")
      private final @Nullable Input<List<String>> userIds;

    public Input<List<String>> getUserIds() {
        return this.userIds == null ? Input.empty() : this.userIds;
    }

    public UserGroupState(
        @Nullable Input<String> arn,
        @Nullable Input<String> engine,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> userGroupId,
        @Nullable Input<List<String>> userIds) {
        this.arn = arn;
        this.engine = engine;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userGroupId = userGroupId;
        this.userIds = userIds;
    }

    private UserGroupState() {
        this.arn = Input.empty();
        this.engine = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.userGroupId = Input.empty();
        this.userIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> engine;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> userGroupId;
        private @Nullable Input<List<String>> userIds;

        public Builder() {
    	      // Empty
        }

        public Builder(UserGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.engine = defaults.engine;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userGroupId = defaults.userGroupId;
    	      this.userIds = defaults.userIds;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder engine(@Nullable Input<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder engine(@Nullable String engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder userGroupId(@Nullable Input<String> userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }

        public Builder userGroupId(@Nullable String userGroupId) {
            this.userGroupId = Input.ofNullable(userGroupId);
            return this;
        }

        public Builder userIds(@Nullable Input<List<String>> userIds) {
            this.userIds = userIds;
            return this;
        }

        public Builder userIds(@Nullable List<String> userIds) {
            this.userIds = Input.ofNullable(userIds);
            return this;
        }
        public UserGroupState build() {
            return new UserGroupState(arn, engine, tags, tagsAll, userGroupId, userIds);
        }
    }
}
