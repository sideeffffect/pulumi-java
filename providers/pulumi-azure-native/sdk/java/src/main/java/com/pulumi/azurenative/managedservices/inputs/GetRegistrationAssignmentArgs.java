// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistrationAssignmentArgs Empty = new GetRegistrationAssignmentArgs();

    /**
     * Tells whether to return registration definition details also along with registration assignment details.
     * 
     */
    @Import(name="expandRegistrationDefinition")
    private @Nullable Boolean expandRegistrationDefinition;

    public Optional<Boolean> expandRegistrationDefinition() {
        return Optional.ofNullable(this.expandRegistrationDefinition);
    }

    /**
     * Guid of the registration assignment.
     * 
     */
    @Import(name="registrationAssignmentId", required=true)
    private String registrationAssignmentId;

    public String registrationAssignmentId() {
        return this.registrationAssignmentId;
    }

    /**
     * Scope of the resource.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    public String scope() {
        return this.scope;
    }

    private GetRegistrationAssignmentArgs() {}

    private GetRegistrationAssignmentArgs(GetRegistrationAssignmentArgs $) {
        this.expandRegistrationDefinition = $.expandRegistrationDefinition;
        this.registrationAssignmentId = $.registrationAssignmentId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistrationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistrationAssignmentArgs $;

        public Builder() {
            $ = new GetRegistrationAssignmentArgs();
        }

        public Builder(GetRegistrationAssignmentArgs defaults) {
            $ = new GetRegistrationAssignmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder expandRegistrationDefinition(@Nullable Boolean expandRegistrationDefinition) {
            $.expandRegistrationDefinition = expandRegistrationDefinition;
            return this;
        }

        public Builder registrationAssignmentId(String registrationAssignmentId) {
            $.registrationAssignmentId = registrationAssignmentId;
            return this;
        }

        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public GetRegistrationAssignmentArgs build() {
            $.registrationAssignmentId = Objects.requireNonNull($.registrationAssignmentId, "expected parameter 'registrationAssignmentId' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
