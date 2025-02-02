// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatasetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetPlainArgs Empty = new GetDatasetPlainArgs();

    /**
     * Dataset name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Dataset name
     * 
     */
    public String name() {
        return this.name;
    }

    private GetDatasetPlainArgs() {}

    private GetDatasetPlainArgs(GetDatasetPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatasetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatasetPlainArgs $;

        public Builder() {
            $ = new GetDatasetPlainArgs();
        }

        public Builder(GetDatasetPlainArgs defaults) {
            $ = new GetDatasetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Dataset name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetDatasetPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
