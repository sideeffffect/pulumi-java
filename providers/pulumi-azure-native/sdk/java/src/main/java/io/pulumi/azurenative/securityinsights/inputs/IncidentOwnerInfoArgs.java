// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information on the user an incident is assigned to
 * 
 */
public final class IncidentOwnerInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IncidentOwnerInfoArgs Empty = new IncidentOwnerInfoArgs();

    /**
     * The name of the user the incident is assigned to.
     * 
     */
    @InputImport(name="assignedTo")
      private final @Nullable Input<String> assignedTo;

    public Input<String> getAssignedTo() {
        return this.assignedTo == null ? Input.empty() : this.assignedTo;
    }

    /**
     * The email of the user the incident is assigned to.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * The object id of the user the incident is assigned to.
     * 
     */
    @InputImport(name="objectId")
      private final @Nullable Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId == null ? Input.empty() : this.objectId;
    }

    /**
     * The user principal name of the user the incident is assigned to.
     * 
     */
    @InputImport(name="userPrincipalName")
      private final @Nullable Input<String> userPrincipalName;

    public Input<String> getUserPrincipalName() {
        return this.userPrincipalName == null ? Input.empty() : this.userPrincipalName;
    }

    public IncidentOwnerInfoArgs(
        @Nullable Input<String> assignedTo,
        @Nullable Input<String> email,
        @Nullable Input<String> objectId,
        @Nullable Input<String> userPrincipalName) {
        this.assignedTo = assignedTo;
        this.email = email;
        this.objectId = objectId;
        this.userPrincipalName = userPrincipalName;
    }

    private IncidentOwnerInfoArgs() {
        this.assignedTo = Input.empty();
        this.email = Input.empty();
        this.objectId = Input.empty();
        this.userPrincipalName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentOwnerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assignedTo;
        private @Nullable Input<String> email;
        private @Nullable Input<String> objectId;
        private @Nullable Input<String> userPrincipalName;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentOwnerInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedTo = defaults.assignedTo;
    	      this.email = defaults.email;
    	      this.objectId = defaults.objectId;
    	      this.userPrincipalName = defaults.userPrincipalName;
        }

        public Builder assignedTo(@Nullable Input<String> assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }

        public Builder assignedTo(@Nullable String assignedTo) {
            this.assignedTo = Input.ofNullable(assignedTo);
            return this;
        }

        public Builder email(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder objectId(@Nullable Input<String> objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder objectId(@Nullable String objectId) {
            this.objectId = Input.ofNullable(objectId);
            return this;
        }

        public Builder userPrincipalName(@Nullable Input<String> userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        public Builder userPrincipalName(@Nullable String userPrincipalName) {
            this.userPrincipalName = Input.ofNullable(userPrincipalName);
            return this;
        }
        public IncidentOwnerInfoArgs build() {
            return new IncidentOwnerInfoArgs(assignedTo, email, objectId, userPrincipalName);
        }
    }
}
