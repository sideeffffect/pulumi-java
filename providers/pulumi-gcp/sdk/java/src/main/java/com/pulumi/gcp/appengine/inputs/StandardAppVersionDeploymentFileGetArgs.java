// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardAppVersionDeploymentFileGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionDeploymentFileGetArgs Empty = new StandardAppVersionDeploymentFileGetArgs();

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * SHA1 checksum of the file
     * 
     */
    @Import(name="sha1Sum")
    private @Nullable Output<String> sha1Sum;

    public Optional<Output<String>> sha1Sum() {
        return Optional.ofNullable(this.sha1Sum);
    }

    /**
     * Source URL
     * 
     */
    @Import(name="sourceUrl", required=true)
    private Output<String> sourceUrl;

    public Output<String> sourceUrl() {
        return this.sourceUrl;
    }

    private StandardAppVersionDeploymentFileGetArgs() {}

    private StandardAppVersionDeploymentFileGetArgs(StandardAppVersionDeploymentFileGetArgs $) {
        this.name = $.name;
        this.sha1Sum = $.sha1Sum;
        this.sourceUrl = $.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardAppVersionDeploymentFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardAppVersionDeploymentFileGetArgs $;

        public Builder() {
            $ = new StandardAppVersionDeploymentFileGetArgs();
        }

        public Builder(StandardAppVersionDeploymentFileGetArgs defaults) {
            $ = new StandardAppVersionDeploymentFileGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sha1Sum(@Nullable Output<String> sha1Sum) {
            $.sha1Sum = sha1Sum;
            return this;
        }

        public Builder sha1Sum(String sha1Sum) {
            return sha1Sum(Output.of(sha1Sum));
        }

        public Builder sourceUrl(Output<String> sourceUrl) {
            $.sourceUrl = sourceUrl;
            return this;
        }

        public Builder sourceUrl(String sourceUrl) {
            return sourceUrl(Output.of(sourceUrl));
        }

        public StandardAppVersionDeploymentFileGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sourceUrl = Objects.requireNonNull($.sourceUrl, "expected parameter 'sourceUrl' to be non-null");
            return $;
        }
    }

}
