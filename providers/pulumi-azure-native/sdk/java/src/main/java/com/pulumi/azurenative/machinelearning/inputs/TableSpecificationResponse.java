// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.ColumnSpecificationResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The swagger 2.0 schema describing a single service input or output. See Swagger specification: http://swagger.io/specification/
 * 
 */
public final class TableSpecificationResponse extends com.pulumi.resources.InvokeArgs {

    public static final TableSpecificationResponse Empty = new TableSpecificationResponse();

    /**
     * Swagger schema description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The format, if &#39;type&#39; is not &#39;object&#39;
     * 
     */
    @Import(name="format")
    private @Nullable String format;

    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The set of columns within the data table.
     * 
     */
    @Import(name="properties")
    private @Nullable Map<String,ColumnSpecificationResponse> properties;

    public Optional<Map<String,ColumnSpecificationResponse>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Swagger schema title.
     * 
     */
    @Import(name="title")
    private @Nullable String title;

    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The type of the entity described in swagger.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private TableSpecificationResponse() {}

    private TableSpecificationResponse(TableSpecificationResponse $) {
        this.description = $.description;
        this.format = $.format;
        this.properties = $.properties;
        this.title = $.title;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableSpecificationResponse $;

        public Builder() {
            $ = new TableSpecificationResponse();
        }

        public Builder(TableSpecificationResponse defaults) {
            $ = new TableSpecificationResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder format(@Nullable String format) {
            $.format = format;
            return this;
        }

        public Builder properties(@Nullable Map<String,ColumnSpecificationResponse> properties) {
            $.properties = properties;
            return this;
        }

        public Builder title(@Nullable String title) {
            $.title = title;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public TableSpecificationResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).def("object").require();
            return $;
        }
    }

}
