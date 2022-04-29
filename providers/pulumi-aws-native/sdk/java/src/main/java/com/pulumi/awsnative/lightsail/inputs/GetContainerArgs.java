// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetContainerArgs extends InvokeArgs {

    public static final GetContainerArgs Empty = new GetContainerArgs();

    /**
     * The name for the container service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name for the container service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetContainerArgs() {}

    private GetContainerArgs(GetContainerArgs $) {
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerArgs $;

        public Builder() {
            $ = new GetContainerArgs();
        }

        public Builder(GetContainerArgs defaults) {
            $ = new GetContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceName The name for the container service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetContainerArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
