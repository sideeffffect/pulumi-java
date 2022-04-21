// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A reference to a file, used for user inputs.
 * 
 */
public final class FileReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final FileReferenceResponse Empty = new FileReferenceResponse();

    /**
     * A path to a file in Google Cloud Storage. Example: gs://build-app-1414623860166/app%40debug-unaligned.apk These paths are expected to be url encoded (percent encoding)
     * 
     */
    @Import(name="gcsPath", required=true)
    private String gcsPath;

    public String gcsPath() {
        return this.gcsPath;
    }

    private FileReferenceResponse() {}

    private FileReferenceResponse(FileReferenceResponse $) {
        this.gcsPath = $.gcsPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse $;

        public Builder() {
            $ = new FileReferenceResponse();
        }

        public Builder(FileReferenceResponse defaults) {
            $ = new FileReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder gcsPath(String gcsPath) {
            $.gcsPath = gcsPath;
            return this;
        }

        public FileReferenceResponse build() {
            $.gcsPath = Objects.requireNonNull($.gcsPath, "expected parameter 'gcsPath' to be non-null");
            return $;
        }
    }

}
