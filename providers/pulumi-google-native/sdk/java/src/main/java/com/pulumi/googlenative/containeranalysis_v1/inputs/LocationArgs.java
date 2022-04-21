// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.VersionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An occurrence of a particular package installation found within a system&#39;s filesystem. E.g., glibc was found in `/var/lib/dpkg/status`.
 * 
 */
public final class LocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationArgs Empty = new LocationArgs();

    /**
     * The CPE URI in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @Import(name="cpeUri", required=true)
    private Output<String> cpeUri;

    public Output<String> cpeUri() {
        return this.cpeUri;
    }

    /**
     * The path from which we gathered that this package/version is installed.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The version installed at this location.
     * 
     */
    @Import(name="version")
    private @Nullable Output<VersionArgs> version;

    public Optional<Output<VersionArgs>> version() {
        return Optional.ofNullable(this.version);
    }

    private LocationArgs() {}

    private LocationArgs(LocationArgs $) {
        this.cpeUri = $.cpeUri;
        this.path = $.path;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationArgs $;

        public Builder() {
            $ = new LocationArgs();
        }

        public Builder(LocationArgs defaults) {
            $ = new LocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpeUri(Output<String> cpeUri) {
            $.cpeUri = cpeUri;
            return this;
        }

        public Builder cpeUri(String cpeUri) {
            return cpeUri(Output.of(cpeUri));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder version(@Nullable Output<VersionArgs> version) {
            $.version = version;
            return this;
        }

        public Builder version(VersionArgs version) {
            return version(Output.of(version));
        }

        public LocationArgs build() {
            $.cpeUri = Objects.requireNonNull($.cpeUri, "expected parameter 'cpeUri' to be non-null");
            return $;
        }
    }

}
