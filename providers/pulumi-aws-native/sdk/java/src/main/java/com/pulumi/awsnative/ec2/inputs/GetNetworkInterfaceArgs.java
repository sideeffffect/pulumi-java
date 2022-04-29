// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkInterfaceArgs extends InvokeArgs {

    public static final GetNetworkInterfaceArgs Empty = new GetNetworkInterfaceArgs();

    /**
     * Network interface id.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Network interface id.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetNetworkInterfaceArgs() {}

    private GetNetworkInterfaceArgs(GetNetworkInterfaceArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkInterfaceArgs $;

        public Builder() {
            $ = new GetNetworkInterfaceArgs();
        }

        public Builder(GetNetworkInterfaceArgs defaults) {
            $ = new GetNetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Network interface id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetNetworkInterfaceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
