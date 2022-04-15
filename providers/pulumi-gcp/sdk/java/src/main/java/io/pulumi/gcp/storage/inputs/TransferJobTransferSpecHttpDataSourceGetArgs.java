// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TransferJobTransferSpecHttpDataSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecHttpDataSourceGetArgs Empty = new TransferJobTransferSpecHttpDataSourceGetArgs();

    /**
     * The URL that points to the file that stores the object list entries. This file must allow public access. Currently, only URLs with HTTP and HTTPS schemes are supported.
     * 
     */
    @Import(name="listUrl", required=true)
      private final Output<String> listUrl;

    public Output<String> listUrl() {
        return this.listUrl;
    }

    public TransferJobTransferSpecHttpDataSourceGetArgs(Output<String> listUrl) {
        this.listUrl = Objects.requireNonNull(listUrl, "expected parameter 'listUrl' to be non-null");
    }

    private TransferJobTransferSpecHttpDataSourceGetArgs() {
        this.listUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecHttpDataSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> listUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecHttpDataSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.listUrl = defaults.listUrl;
        }

        public Builder listUrl(Output<String> listUrl) {
            this.listUrl = Objects.requireNonNull(listUrl);
            return this;
        }
        public Builder listUrl(String listUrl) {
            this.listUrl = Output.of(Objects.requireNonNull(listUrl));
            return this;
        }        public TransferJobTransferSpecHttpDataSourceGetArgs build() {
            return new TransferJobTransferSpecHttpDataSourceGetArgs(listUrl);
        }
    }
}
