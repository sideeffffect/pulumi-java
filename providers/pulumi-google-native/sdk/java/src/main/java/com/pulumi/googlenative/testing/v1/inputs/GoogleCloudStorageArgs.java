// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A storage location within Google cloud storage (GCS).
 * 
 */
public final class GoogleCloudStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudStorageArgs Empty = new GoogleCloudStorageArgs();

    /**
     * The path to a directory in GCS that will eventually contain the results for this test. The requesting user must have write access on the bucket in the supplied path.
     * 
     */
    @Import(name="gcsPath", required=true)
    private Output<String> gcsPath;

    /**
     * @return The path to a directory in GCS that will eventually contain the results for this test. The requesting user must have write access on the bucket in the supplied path.
     * 
     */
    public Output<String> gcsPath() {
        return this.gcsPath;
    }

    private GoogleCloudStorageArgs() {}

    private GoogleCloudStorageArgs(GoogleCloudStorageArgs $) {
        this.gcsPath = $.gcsPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudStorageArgs $;

        public Builder() {
            $ = new GoogleCloudStorageArgs();
        }

        public Builder(GoogleCloudStorageArgs defaults) {
            $ = new GoogleCloudStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gcsPath The path to a directory in GCS that will eventually contain the results for this test. The requesting user must have write access on the bucket in the supplied path.
         * 
         * @return builder
         * 
         */
        public Builder gcsPath(Output<String> gcsPath) {
            $.gcsPath = gcsPath;
            return this;
        }

        /**
         * @param gcsPath The path to a directory in GCS that will eventually contain the results for this test. The requesting user must have write access on the bucket in the supplied path.
         * 
         * @return builder
         * 
         */
        public Builder gcsPath(String gcsPath) {
            return gcsPath(Output.of(gcsPath));
        }

        public GoogleCloudStorageArgs build() {
            $.gcsPath = Objects.requireNonNull($.gcsPath, "expected parameter 'gcsPath' to be non-null");
            return $;
        }
    }

}
