// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.azurenative.resources.inputs.AliasPathMetadataResponse;
import com.pulumi.azurenative.resources.inputs.AliasPathResponse;
import com.pulumi.azurenative.resources.inputs.AliasPatternResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The alias type.
 * 
 */
public final class AliasResponse extends com.pulumi.resources.InvokeArgs {

    public static final AliasResponse Empty = new AliasResponse();

    /**
     * The default alias path metadata. Applies to the default path and to any alias path that doesn&#39;t have metadata
     * 
     */
    @Import(name="defaultMetadata", required=true)
    private AliasPathMetadataResponse defaultMetadata;

    public AliasPathMetadataResponse defaultMetadata() {
        return this.defaultMetadata;
    }

    /**
     * The default path for an alias.
     * 
     */
    @Import(name="defaultPath")
    private @Nullable String defaultPath;

    public Optional<String> defaultPath() {
        return Optional.ofNullable(this.defaultPath);
    }

    /**
     * The default pattern for an alias.
     * 
     */
    @Import(name="defaultPattern")
    private @Nullable AliasPatternResponse defaultPattern;

    public Optional<AliasPatternResponse> defaultPattern() {
        return Optional.ofNullable(this.defaultPattern);
    }

    /**
     * The alias name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The paths for an alias.
     * 
     */
    @Import(name="paths")
    private @Nullable List<AliasPathResponse> paths;

    public Optional<List<AliasPathResponse>> paths() {
        return Optional.ofNullable(this.paths);
    }

    /**
     * The type of the alias.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private AliasResponse() {}

    private AliasResponse(AliasResponse $) {
        this.defaultMetadata = $.defaultMetadata;
        this.defaultPath = $.defaultPath;
        this.defaultPattern = $.defaultPattern;
        this.name = $.name;
        this.paths = $.paths;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasResponse $;

        public Builder() {
            $ = new AliasResponse();
        }

        public Builder(AliasResponse defaults) {
            $ = new AliasResponse(Objects.requireNonNull(defaults));
        }

        public Builder defaultMetadata(AliasPathMetadataResponse defaultMetadata) {
            $.defaultMetadata = defaultMetadata;
            return this;
        }

        public Builder defaultPath(@Nullable String defaultPath) {
            $.defaultPath = defaultPath;
            return this;
        }

        public Builder defaultPattern(@Nullable AliasPatternResponse defaultPattern) {
            $.defaultPattern = defaultPattern;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder paths(@Nullable List<AliasPathResponse> paths) {
            $.paths = paths;
            return this;
        }

        public Builder paths(AliasPathResponse... paths) {
            return paths(List.of(paths));
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public AliasResponse build() {
            $.defaultMetadata = Objects.requireNonNull($.defaultMetadata, "expected parameter 'defaultMetadata' to be non-null");
            return $;
        }
    }

}
