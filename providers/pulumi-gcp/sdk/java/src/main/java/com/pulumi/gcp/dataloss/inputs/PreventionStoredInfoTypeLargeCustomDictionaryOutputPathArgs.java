// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs();

    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs() {}

    private PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs(PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs $;

        public Builder() {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs();
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs defaults) {
            $ = new PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs(Objects.requireNonNull(defaults));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public PreventionStoredInfoTypeLargeCustomDictionaryOutputPathArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
