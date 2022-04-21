// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * User assigned identity properties
 * 
 */
public final class UserAssignedIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserAssignedIdentityResponse Empty = new UserAssignedIdentityResponse();

    /**
     * The client ID of the assigned identity.
     * 
     */
    @Import(name="clientId", required=true)
    private String clientId;

    public String clientId() {
        return this.clientId;
    }

    /**
     * The principal ID of the assigned identity.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    public String principalId() {
        return this.principalId;
    }

    private UserAssignedIdentityResponse() {}

    private UserAssignedIdentityResponse(UserAssignedIdentityResponse $) {
        this.clientId = $.clientId;
        this.principalId = $.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAssignedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAssignedIdentityResponse $;

        public Builder() {
            $ = new UserAssignedIdentityResponse();
        }

        public Builder(UserAssignedIdentityResponse defaults) {
            $ = new UserAssignedIdentityResponse(Objects.requireNonNull(defaults));
        }

        public Builder clientId(String clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        public UserAssignedIdentityResponse build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            return $;
        }
    }

}
