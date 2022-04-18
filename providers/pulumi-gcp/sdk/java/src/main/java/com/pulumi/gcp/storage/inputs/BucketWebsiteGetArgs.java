// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketWebsiteGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketWebsiteGetArgs Empty = new BucketWebsiteGetArgs();

    /**
     * Behaves as the bucket's directory index where
     * missing objects are treated as potential directories.
     * 
     */
    @Import(name="mainPageSuffix")
      private final @Nullable Output<String> mainPageSuffix;

    public Output<String> mainPageSuffix() {
        return this.mainPageSuffix == null ? Codegen.empty() : this.mainPageSuffix;
    }

    /**
     * The custom object to return when a requested
     * resource is not found.
     * 
     */
    @Import(name="notFoundPage")
      private final @Nullable Output<String> notFoundPage;

    public Output<String> notFoundPage() {
        return this.notFoundPage == null ? Codegen.empty() : this.notFoundPage;
    }

    public BucketWebsiteGetArgs(
        @Nullable Output<String> mainPageSuffix,
        @Nullable Output<String> notFoundPage) {
        this.mainPageSuffix = mainPageSuffix;
        this.notFoundPage = notFoundPage;
    }

    private BucketWebsiteGetArgs() {
        this.mainPageSuffix = Codegen.empty();
        this.notFoundPage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mainPageSuffix;
        private @Nullable Output<String> notFoundPage;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketWebsiteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mainPageSuffix = defaults.mainPageSuffix;
    	      this.notFoundPage = defaults.notFoundPage;
        }

        public Builder mainPageSuffix(@Nullable Output<String> mainPageSuffix) {
            this.mainPageSuffix = mainPageSuffix;
            return this;
        }
        public Builder mainPageSuffix(@Nullable String mainPageSuffix) {
            this.mainPageSuffix = Codegen.ofNullable(mainPageSuffix);
            return this;
        }
        public Builder notFoundPage(@Nullable Output<String> notFoundPage) {
            this.notFoundPage = notFoundPage;
            return this;
        }
        public Builder notFoundPage(@Nullable String notFoundPage) {
            this.notFoundPage = Codegen.ofNullable(notFoundPage);
            return this;
        }        public BucketWebsiteGetArgs build() {
            return new BucketWebsiteGetArgs(mainPageSuffix, notFoundPage);
        }
    }
}
