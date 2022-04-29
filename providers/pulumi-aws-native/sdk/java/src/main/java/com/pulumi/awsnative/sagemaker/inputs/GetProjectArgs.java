// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetProjectArgs extends InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    @Import(name="projectArn", required=true)
    private String projectArn;

    public String projectArn() {
        return this.projectArn;
    }

    private GetProjectArgs() {}

    private GetProjectArgs(GetProjectArgs $) {
        this.projectArn = $.projectArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectArgs $;

        public Builder() {
            $ = new GetProjectArgs();
        }

        public Builder(GetProjectArgs defaults) {
            $ = new GetProjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder projectArn(String projectArn) {
            $.projectArn = projectArn;
            return this;
        }

        public GetProjectArgs build() {
            $.projectArn = Objects.requireNonNull($.projectArn, "expected parameter 'projectArn' to be non-null");
            return $;
        }
    }

}
