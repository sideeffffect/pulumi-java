// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.enums.VersionKind;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Version contains structured information about the version of a package.
 * 
 */
public final class VersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VersionArgs Empty = new VersionArgs();

    /**
     * Used to correct mistakes in the version numbering scheme.
     * 
     */
    @Import(name="epoch")
    private @Nullable Output<Integer> epoch;

    public Optional<Output<Integer>> epoch() {
        return Optional.ofNullable(this.epoch);
    }

    /**
     * Whether this version is specifying part of an inclusive range. Grafeas does not have the capability to specify version ranges; instead we have fields that specify start version and end versions. At times this is insufficient - we also need to specify whether the version is included in the range or is excluded from the range. This boolean is expected to be set to true when the version is included in a range.
     * 
     */
    @Import(name="inclusive")
    private @Nullable Output<Boolean> inclusive;

    public Optional<Output<Boolean>> inclusive() {
        return Optional.ofNullable(this.inclusive);
    }

    /**
     * Distinguishes between sentinel MIN/MAX versions and normal versions.
     * 
     */
    @Import(name="kind", required=true)
    private Output<VersionKind> kind;

    public Output<VersionKind> kind() {
        return this.kind;
    }

    /**
     * Required only when version kind is NORMAL. The main part of the version name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The iteration of the package build from the above version.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<String> revision;

    public Optional<Output<String>> revision() {
        return Optional.ofNullable(this.revision);
    }

    private VersionArgs() {}

    private VersionArgs(VersionArgs $) {
        this.epoch = $.epoch;
        this.inclusive = $.inclusive;
        this.kind = $.kind;
        this.name = $.name;
        this.revision = $.revision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VersionArgs $;

        public Builder() {
            $ = new VersionArgs();
        }

        public Builder(VersionArgs defaults) {
            $ = new VersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder epoch(@Nullable Output<Integer> epoch) {
            $.epoch = epoch;
            return this;
        }

        public Builder epoch(Integer epoch) {
            return epoch(Output.of(epoch));
        }

        public Builder inclusive(@Nullable Output<Boolean> inclusive) {
            $.inclusive = inclusive;
            return this;
        }

        public Builder inclusive(Boolean inclusive) {
            return inclusive(Output.of(inclusive));
        }

        public Builder kind(Output<VersionKind> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(VersionKind kind) {
            return kind(Output.of(kind));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder revision(@Nullable Output<String> revision) {
            $.revision = revision;
            return this;
        }

        public Builder revision(String revision) {
            return revision(Output.of(revision));
        }

        public VersionArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
