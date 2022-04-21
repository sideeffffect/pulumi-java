// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The client access policy.
 * 
 */
public final class CrossSiteAccessPoliciesResponse extends com.pulumi.resources.InvokeArgs {

    public static final CrossSiteAccessPoliciesResponse Empty = new CrossSiteAccessPoliciesResponse();

    /**
     * The content of clientaccesspolicy.xml used by Silverlight.
     * 
     */
    @Import(name="clientAccessPolicy")
    private @Nullable String clientAccessPolicy;

    public Optional<String> clientAccessPolicy() {
        return Optional.ofNullable(this.clientAccessPolicy);
    }

    /**
     * The content of crossdomain.xml used by Silverlight.
     * 
     */
    @Import(name="crossDomainPolicy")
    private @Nullable String crossDomainPolicy;

    public Optional<String> crossDomainPolicy() {
        return Optional.ofNullable(this.crossDomainPolicy);
    }

    private CrossSiteAccessPoliciesResponse() {}

    private CrossSiteAccessPoliciesResponse(CrossSiteAccessPoliciesResponse $) {
        this.clientAccessPolicy = $.clientAccessPolicy;
        this.crossDomainPolicy = $.crossDomainPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CrossSiteAccessPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CrossSiteAccessPoliciesResponse $;

        public Builder() {
            $ = new CrossSiteAccessPoliciesResponse();
        }

        public Builder(CrossSiteAccessPoliciesResponse defaults) {
            $ = new CrossSiteAccessPoliciesResponse(Objects.requireNonNull(defaults));
        }

        public Builder clientAccessPolicy(@Nullable String clientAccessPolicy) {
            $.clientAccessPolicy = clientAccessPolicy;
            return this;
        }

        public Builder crossDomainPolicy(@Nullable String crossDomainPolicy) {
            $.crossDomainPolicy = crossDomainPolicy;
            return this;
        }

        public CrossSiteAccessPoliciesResponse build() {
            return $;
        }
    }

}
