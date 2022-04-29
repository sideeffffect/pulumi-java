// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisvideo.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetStreamArgs extends InvokeArgs {

    public static final GetStreamArgs Empty = new GetStreamArgs();

    /**
     * The name of the Kinesis Video stream.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Kinesis Video stream.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetStreamArgs() {}

    private GetStreamArgs(GetStreamArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamArgs $;

        public Builder() {
            $ = new GetStreamArgs();
        }

        public Builder(GetStreamArgs defaults) {
            $ = new GetStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Kinesis Video stream.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetStreamArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
