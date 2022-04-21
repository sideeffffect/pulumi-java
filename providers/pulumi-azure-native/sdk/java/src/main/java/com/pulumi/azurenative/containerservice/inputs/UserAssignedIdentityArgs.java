// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserAssignedIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserAssignedIdentityArgs Empty = new UserAssignedIdentityArgs();

    /**
     * The client id of the user assigned identity.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The object id of the user assigned identity.
     * 
     */
    @Import(name="objectId")
    private @Nullable Output<String> objectId;

    public Optional<Output<String>> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * The resource id of the user assigned identity.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private UserAssignedIdentityArgs() {}

    private UserAssignedIdentityArgs(UserAssignedIdentityArgs $) {
        this.clientId = $.clientId;
        this.objectId = $.objectId;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAssignedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAssignedIdentityArgs $;

        public Builder() {
            $ = new UserAssignedIdentityArgs();
        }

        public Builder(UserAssignedIdentityArgs defaults) {
            $ = new UserAssignedIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder objectId(@Nullable Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public UserAssignedIdentityArgs build() {
            return $;
        }
    }

}
