// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PipelineDatastore extends com.pulumi.resources.InvokeArgs {

    public static final PipelineDatastore Empty = new PipelineDatastore();

    @Import(name="datastoreName", required=true)
    private String datastoreName;

    public String datastoreName() {
        return this.datastoreName;
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private PipelineDatastore() {}

    private PipelineDatastore(PipelineDatastore $) {
        this.datastoreName = $.datastoreName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineDatastore defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineDatastore $;

        public Builder() {
            $ = new PipelineDatastore();
        }

        public Builder(PipelineDatastore defaults) {
            $ = new PipelineDatastore(Objects.requireNonNull(defaults));
        }

        public Builder datastoreName(String datastoreName) {
            $.datastoreName = datastoreName;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public PipelineDatastore build() {
            $.datastoreName = Objects.requireNonNull($.datastoreName, "expected parameter 'datastoreName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
