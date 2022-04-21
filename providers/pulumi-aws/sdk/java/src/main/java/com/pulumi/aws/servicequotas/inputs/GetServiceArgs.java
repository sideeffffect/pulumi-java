// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicequotas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    /**
     * Service name to lookup within Service Quotas. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    private GetServiceArgs() {}

    private GetServiceArgs(GetServiceArgs $) {
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceArgs $;

        public Builder() {
            $ = new GetServiceArgs();
        }

        public Builder(GetServiceArgs defaults) {
            $ = new GetServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetServiceArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
