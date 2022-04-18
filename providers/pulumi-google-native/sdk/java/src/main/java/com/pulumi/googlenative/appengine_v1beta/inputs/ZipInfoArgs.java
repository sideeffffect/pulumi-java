// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The zip file information for a zip deployment.
 * 
 */
public final class ZipInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZipInfoArgs Empty = new ZipInfoArgs();

    /**
     * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    @Import(name="filesCount")
      private final @Nullable Output<Integer> filesCount;

    public Output<Integer> filesCount() {
        return this.filesCount == null ? Codegen.empty() : this.filesCount;
    }

    /**
     * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'.
     * 
     */
    @Import(name="sourceUrl")
      private final @Nullable Output<String> sourceUrl;

    public Output<String> sourceUrl() {
        return this.sourceUrl == null ? Codegen.empty() : this.sourceUrl;
    }

    public ZipInfoArgs(
        @Nullable Output<Integer> filesCount,
        @Nullable Output<String> sourceUrl) {
        this.filesCount = filesCount;
        this.sourceUrl = sourceUrl;
    }

    private ZipInfoArgs() {
        this.filesCount = Codegen.empty();
        this.sourceUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZipInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> filesCount;
        private @Nullable Output<String> sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ZipInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesCount = defaults.filesCount;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder filesCount(@Nullable Output<Integer> filesCount) {
            this.filesCount = filesCount;
            return this;
        }
        public Builder filesCount(@Nullable Integer filesCount) {
            this.filesCount = Codegen.ofNullable(filesCount);
            return this;
        }
        public Builder sourceUrl(@Nullable Output<String> sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public Builder sourceUrl(@Nullable String sourceUrl) {
            this.sourceUrl = Codegen.ofNullable(sourceUrl);
            return this;
        }        public ZipInfoArgs build() {
            return new ZipInfoArgs(filesCount, sourceUrl);
        }
    }
}
