// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetAccountArgs extends InvokeArgs {

    public static final GetAccountArgs Empty = new GetAccountArgs();

    /**
     * Primary identifier which is manually generated.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Primary identifier which is manually generated.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetAccountArgs() {}

    private GetAccountArgs(GetAccountArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountArgs $;

        public Builder() {
            $ = new GetAccountArgs();
        }

        public Builder(GetAccountArgs defaults) {
            $ = new GetAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Primary identifier which is manually generated.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetAccountArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
