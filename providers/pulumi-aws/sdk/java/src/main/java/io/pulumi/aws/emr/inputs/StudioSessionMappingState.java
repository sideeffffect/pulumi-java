// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioSessionMappingState extends io.pulumi.resources.ResourceArgs {

    public static final StudioSessionMappingState Empty = new StudioSessionMappingState();

    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Import(name="identityId")
      private final @Nullable Output<String> identityId;

    public Output<String> identityId() {
        return this.identityId == null ? Codegen.empty() : this.identityId;
    }

    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Import(name="identityName")
      private final @Nullable Output<String> identityName;

    public Output<String> identityName() {
        return this.identityName == null ? Codegen.empty() : this.identityName;
    }

    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    @Import(name="identityType")
      private final @Nullable Output<String> identityType;

    public Output<String> identityType() {
        return this.identityType == null ? Codegen.empty() : this.identityType;
    }

    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    @Import(name="sessionPolicyArn")
      private final @Nullable Output<String> sessionPolicyArn;

    public Output<String> sessionPolicyArn() {
        return this.sessionPolicyArn == null ? Codegen.empty() : this.sessionPolicyArn;
    }

    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @Import(name="studioId")
      private final @Nullable Output<String> studioId;

    public Output<String> studioId() {
        return this.studioId == null ? Codegen.empty() : this.studioId;
    }

    public StudioSessionMappingState(
        @Nullable Output<String> identityId,
        @Nullable Output<String> identityName,
        @Nullable Output<String> identityType,
        @Nullable Output<String> sessionPolicyArn,
        @Nullable Output<String> studioId) {
        this.identityId = identityId;
        this.identityName = identityName;
        this.identityType = identityType;
        this.sessionPolicyArn = sessionPolicyArn;
        this.studioId = studioId;
    }

    private StudioSessionMappingState() {
        this.identityId = Codegen.empty();
        this.identityName = Codegen.empty();
        this.identityType = Codegen.empty();
        this.sessionPolicyArn = Codegen.empty();
        this.studioId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioSessionMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> identityId;
        private @Nullable Output<String> identityName;
        private @Nullable Output<String> identityType;
        private @Nullable Output<String> sessionPolicyArn;
        private @Nullable Output<String> studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioSessionMappingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityId = defaults.identityId;
    	      this.identityName = defaults.identityName;
    	      this.identityType = defaults.identityType;
    	      this.sessionPolicyArn = defaults.sessionPolicyArn;
    	      this.studioId = defaults.studioId;
        }

        public Builder identityId(@Nullable Output<String> identityId) {
            this.identityId = identityId;
            return this;
        }
        public Builder identityId(@Nullable String identityId) {
            this.identityId = Codegen.ofNullable(identityId);
            return this;
        }
        public Builder identityName(@Nullable Output<String> identityName) {
            this.identityName = identityName;
            return this;
        }
        public Builder identityName(@Nullable String identityName) {
            this.identityName = Codegen.ofNullable(identityName);
            return this;
        }
        public Builder identityType(@Nullable Output<String> identityType) {
            this.identityType = identityType;
            return this;
        }
        public Builder identityType(@Nullable String identityType) {
            this.identityType = Codegen.ofNullable(identityType);
            return this;
        }
        public Builder sessionPolicyArn(@Nullable Output<String> sessionPolicyArn) {
            this.sessionPolicyArn = sessionPolicyArn;
            return this;
        }
        public Builder sessionPolicyArn(@Nullable String sessionPolicyArn) {
            this.sessionPolicyArn = Codegen.ofNullable(sessionPolicyArn);
            return this;
        }
        public Builder studioId(@Nullable Output<String> studioId) {
            this.studioId = studioId;
            return this;
        }
        public Builder studioId(@Nullable String studioId) {
            this.studioId = Codegen.ofNullable(studioId);
            return this;
        }        public StudioSessionMappingState build() {
            return new StudioSessionMappingState(identityId, identityName, identityType, sessionPolicyArn, studioId);
        }
    }
}
