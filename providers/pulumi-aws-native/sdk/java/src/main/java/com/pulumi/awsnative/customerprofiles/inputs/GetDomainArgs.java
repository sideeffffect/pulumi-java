// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDomainArgs extends InvokeArgs {

    public static final GetDomainArgs Empty = new GetDomainArgs();

    /**
     * The unique name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
    private String domainName;

    /**
     * @return The unique name of the domain.
     * 
     */
    public String domainName() {
        return this.domainName;
    }

    private GetDomainArgs() {}

    private GetDomainArgs(GetDomainArgs $) {
        this.domainName = $.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainArgs $;

        public Builder() {
            $ = new GetDomainArgs();
        }

        public Builder(GetDomainArgs defaults) {
            $ = new GetDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The unique name of the domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        public GetDomainArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            return $;
        }
    }

}
