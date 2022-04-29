// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetFrameworkArgs extends InvokeArgs {

    public static final GetFrameworkArgs Empty = new GetFrameworkArgs();

    /**
     * An Amazon Resource Name (ARN) that uniquely identifies Framework as a resource
     * 
     */
    @Import(name="frameworkArn", required=true)
    private String frameworkArn;

    /**
     * @return An Amazon Resource Name (ARN) that uniquely identifies Framework as a resource
     * 
     */
    public String frameworkArn() {
        return this.frameworkArn;
    }

    private GetFrameworkArgs() {}

    private GetFrameworkArgs(GetFrameworkArgs $) {
        this.frameworkArn = $.frameworkArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFrameworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFrameworkArgs $;

        public Builder() {
            $ = new GetFrameworkArgs();
        }

        public Builder(GetFrameworkArgs defaults) {
            $ = new GetFrameworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param frameworkArn An Amazon Resource Name (ARN) that uniquely identifies Framework as a resource
         * 
         * @return builder
         * 
         */
        public Builder frameworkArn(String frameworkArn) {
            $.frameworkArn = frameworkArn;
            return this;
        }

        public GetFrameworkArgs build() {
            $.frameworkArn = Objects.requireNonNull($.frameworkArn, "expected parameter 'frameworkArn' to be non-null");
            return $;
        }
    }

}
