// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRepositoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryArgs Empty = new GetRepositoryArgs();

    /**
     * The name to use for the repository. The repository name may be specified on its own (such as nginx-web-app) or it can be prepended with a namespace to group the repository into a category (such as project-a/nginx-web-app). If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the repository name. For more information, see https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html.
     * 
     */
    @Import(name="repositoryName", required=true)
    private String repositoryName;

    public String repositoryName() {
        return this.repositoryName;
    }

    private GetRepositoryArgs() {}

    private GetRepositoryArgs(GetRepositoryArgs $) {
        this.repositoryName = $.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryArgs $;

        public Builder() {
            $ = new GetRepositoryArgs();
        }

        public Builder(GetRepositoryArgs defaults) {
            $ = new GetRepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder repositoryName(String repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        public GetRepositoryArgs build() {
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            return $;
        }
    }

}
