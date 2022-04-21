// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The user assigned managed identity to use when accessing a resource.
 * 
 */
public final class ResourceIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceIdentityResponse Empty = new ResourceIdentityResponse();

    /**
     * The user assigned managed identity&#39;s resource identifier to use when accessing a resource.
     * 
     */
    @Import(name="userAssignedIdentity", required=true)
    private String userAssignedIdentity;

    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    private ResourceIdentityResponse() {}

    private ResourceIdentityResponse(ResourceIdentityResponse $) {
        this.userAssignedIdentity = $.userAssignedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdentityResponse $;

        public Builder() {
            $ = new ResourceIdentityResponse();
        }

        public Builder(ResourceIdentityResponse defaults) {
            $ = new ResourceIdentityResponse(Objects.requireNonNull(defaults));
        }

        public Builder userAssignedIdentity(String userAssignedIdentity) {
            $.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        public ResourceIdentityResponse build() {
            $.userAssignedIdentity = Objects.requireNonNull($.userAssignedIdentity, "expected parameter 'userAssignedIdentity' to be non-null");
            return $;
        }
    }

}
