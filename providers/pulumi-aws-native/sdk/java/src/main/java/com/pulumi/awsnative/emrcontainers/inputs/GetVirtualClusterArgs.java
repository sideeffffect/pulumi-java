// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emrcontainers.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualClusterArgs extends InvokeArgs {

    public static final GetVirtualClusterArgs Empty = new GetVirtualClusterArgs();

    /**
     * Id of the virtual cluster.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Id of the virtual cluster.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetVirtualClusterArgs() {}

    private GetVirtualClusterArgs(GetVirtualClusterArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualClusterArgs $;

        public Builder() {
            $ = new GetVirtualClusterArgs();
        }

        public Builder(GetVirtualClusterArgs defaults) {
            $ = new GetVirtualClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Id of the virtual cluster.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetVirtualClusterArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
