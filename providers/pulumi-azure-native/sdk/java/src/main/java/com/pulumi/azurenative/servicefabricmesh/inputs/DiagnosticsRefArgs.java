// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to sinks in DiagnosticsDescription.
 * 
 */
public final class DiagnosticsRefArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticsRefArgs Empty = new DiagnosticsRefArgs();

    /**
     * Status of whether or not sinks are enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * List of sinks to be used if enabled. References the list of sinks in DiagnosticsDescription.
     * 
     */
    @Import(name="sinkRefs")
    private @Nullable Output<List<String>> sinkRefs;

    public Optional<Output<List<String>>> sinkRefs() {
        return Optional.ofNullable(this.sinkRefs);
    }

    private DiagnosticsRefArgs() {}

    private DiagnosticsRefArgs(DiagnosticsRefArgs $) {
        this.enabled = $.enabled;
        this.sinkRefs = $.sinkRefs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticsRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticsRefArgs $;

        public Builder() {
            $ = new DiagnosticsRefArgs();
        }

        public Builder(DiagnosticsRefArgs defaults) {
            $ = new DiagnosticsRefArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder sinkRefs(@Nullable Output<List<String>> sinkRefs) {
            $.sinkRefs = sinkRefs;
            return this;
        }

        public Builder sinkRefs(List<String> sinkRefs) {
            return sinkRefs(Output.of(sinkRefs));
        }

        public Builder sinkRefs(String... sinkRefs) {
            return sinkRefs(List.of(sinkRefs));
        }

        public DiagnosticsRefArgs build() {
            return $;
        }
    }

}
