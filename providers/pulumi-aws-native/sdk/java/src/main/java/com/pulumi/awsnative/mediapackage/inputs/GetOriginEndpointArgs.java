// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetOriginEndpointArgs extends InvokeArgs {

    public static final GetOriginEndpointArgs Empty = new GetOriginEndpointArgs();

    /**
     * The ID of the OriginEndpoint.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the OriginEndpoint.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetOriginEndpointArgs() {}

    private GetOriginEndpointArgs(GetOriginEndpointArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOriginEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOriginEndpointArgs $;

        public Builder() {
            $ = new GetOriginEndpointArgs();
        }

        public Builder(GetOriginEndpointArgs defaults) {
            $ = new GetOriginEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the OriginEndpoint.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetOriginEndpointArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
