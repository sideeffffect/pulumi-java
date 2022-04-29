// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetModuleVersionArgs extends InvokeArgs {

    public static final GetModuleVersionArgs Empty = new GetModuleVersionArgs();

    /**
     * The Amazon Resource Name (ARN) of the module.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the module.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetModuleVersionArgs() {}

    private GetModuleVersionArgs(GetModuleVersionArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModuleVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModuleVersionArgs $;

        public Builder() {
            $ = new GetModuleVersionArgs();
        }

        public Builder(GetModuleVersionArgs defaults) {
            $ = new GetModuleVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the module.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetModuleVersionArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
