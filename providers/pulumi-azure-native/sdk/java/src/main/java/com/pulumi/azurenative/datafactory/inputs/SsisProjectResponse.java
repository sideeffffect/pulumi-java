// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SsisEnvironmentReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.SsisParameterResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis project.
 * 
 */
public final class SsisProjectResponse extends com.pulumi.resources.InvokeArgs {

    public static final SsisProjectResponse Empty = new SsisProjectResponse();

    /**
     * Metadata description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Environment reference in project
     * 
     */
    @Import(name="environmentRefs")
    private @Nullable List<SsisEnvironmentReferenceResponse> environmentRefs;

    public Optional<List<SsisEnvironmentReferenceResponse>> environmentRefs() {
        return Optional.ofNullable(this.environmentRefs);
    }

    /**
     * Folder id which contains project.
     * 
     */
    @Import(name="folderId")
    private @Nullable Double folderId;

    public Optional<Double> folderId() {
        return Optional.ofNullable(this.folderId);
    }

    /**
     * Metadata id.
     * 
     */
    @Import(name="id")
    private @Nullable Double id;

    public Optional<Double> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Metadata name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Parameters in project
     * 
     */
    @Import(name="parameters")
    private @Nullable List<SsisParameterResponse> parameters;

    public Optional<List<SsisParameterResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The type of SSIS object metadata.
     * Expected value is &#39;Project&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Project version.
     * 
     */
    @Import(name="version")
    private @Nullable Double version;

    public Optional<Double> version() {
        return Optional.ofNullable(this.version);
    }

    private SsisProjectResponse() {}

    private SsisProjectResponse(SsisProjectResponse $) {
        this.description = $.description;
        this.environmentRefs = $.environmentRefs;
        this.folderId = $.folderId;
        this.id = $.id;
        this.name = $.name;
        this.parameters = $.parameters;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SsisProjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SsisProjectResponse $;

        public Builder() {
            $ = new SsisProjectResponse();
        }

        public Builder(SsisProjectResponse defaults) {
            $ = new SsisProjectResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder environmentRefs(@Nullable List<SsisEnvironmentReferenceResponse> environmentRefs) {
            $.environmentRefs = environmentRefs;
            return this;
        }

        public Builder environmentRefs(SsisEnvironmentReferenceResponse... environmentRefs) {
            return environmentRefs(List.of(environmentRefs));
        }

        public Builder folderId(@Nullable Double folderId) {
            $.folderId = folderId;
            return this;
        }

        public Builder id(@Nullable Double id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(@Nullable List<SsisParameterResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(SsisParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder version(@Nullable Double version) {
            $.version = version;
            return this;
        }

        public SsisProjectResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
