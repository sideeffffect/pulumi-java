// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataplex_v1.enums.GoogleCloudDataplexV1SchemaSchemaFieldMode;
import com.pulumi.googlenative.dataplex_v1.enums.GoogleCloudDataplexV1SchemaSchemaFieldType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a column field within a table schema.
 * 
 */
public final class GoogleCloudDataplexV1SchemaSchemaFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1SchemaSchemaFieldArgs Empty = new GoogleCloudDataplexV1SchemaSchemaFieldArgs();

    /**
     * Optional. User friendly field description. Must be less than or equal to 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. User friendly field description. Must be less than or equal to 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Any nested field for complex types.
     * 
     */
    @Import(name="fields")
    private @Nullable Output<List<GoogleCloudDataplexV1SchemaSchemaFieldArgs>> fields;

    /**
     * @return Optional. Any nested field for complex types.
     * 
     */
    public Optional<Output<List<GoogleCloudDataplexV1SchemaSchemaFieldArgs>>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * Additional field semantics.
     * 
     */
    @Import(name="mode", required=true)
    private Output<GoogleCloudDataplexV1SchemaSchemaFieldMode> mode;

    /**
     * @return Additional field semantics.
     * 
     */
    public Output<GoogleCloudDataplexV1SchemaSchemaFieldMode> mode() {
        return this.mode;
    }

    /**
     * The name of the field. Must contain only letters, numbers and underscores, with a maximum length of 767 characters, and must begin with a letter or underscore.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the field. Must contain only letters, numbers and underscores, with a maximum length of 767 characters, and must begin with a letter or underscore.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of field.
     * 
     */
    @Import(name="type", required=true)
    private Output<GoogleCloudDataplexV1SchemaSchemaFieldType> type;

    /**
     * @return The type of field.
     * 
     */
    public Output<GoogleCloudDataplexV1SchemaSchemaFieldType> type() {
        return this.type;
    }

    private GoogleCloudDataplexV1SchemaSchemaFieldArgs() {}

    private GoogleCloudDataplexV1SchemaSchemaFieldArgs(GoogleCloudDataplexV1SchemaSchemaFieldArgs $) {
        this.description = $.description;
        this.fields = $.fields;
        this.mode = $.mode;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1SchemaSchemaFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1SchemaSchemaFieldArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1SchemaSchemaFieldArgs();
        }

        public Builder(GoogleCloudDataplexV1SchemaSchemaFieldArgs defaults) {
            $ = new GoogleCloudDataplexV1SchemaSchemaFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. User friendly field description. Must be less than or equal to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. User friendly field description. Must be less than or equal to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fields Optional. Any nested field for complex types.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable Output<List<GoogleCloudDataplexV1SchemaSchemaFieldArgs>> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields Optional. Any nested field for complex types.
         * 
         * @return builder
         * 
         */
        public Builder fields(List<GoogleCloudDataplexV1SchemaSchemaFieldArgs> fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param fields Optional. Any nested field for complex types.
         * 
         * @return builder
         * 
         */
        public Builder fields(GoogleCloudDataplexV1SchemaSchemaFieldArgs... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param mode Additional field semantics.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<GoogleCloudDataplexV1SchemaSchemaFieldMode> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Additional field semantics.
         * 
         * @return builder
         * 
         */
        public Builder mode(GoogleCloudDataplexV1SchemaSchemaFieldMode mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name The name of the field. Must contain only letters, numbers and underscores, with a maximum length of 767 characters, and must begin with a letter or underscore.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the field. Must contain only letters, numbers and underscores, with a maximum length of 767 characters, and must begin with a letter or underscore.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of field.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<GoogleCloudDataplexV1SchemaSchemaFieldType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of field.
         * 
         * @return builder
         * 
         */
        public Builder type(GoogleCloudDataplexV1SchemaSchemaFieldType type) {
            return type(Output.of(type));
        }

        public GoogleCloudDataplexV1SchemaSchemaFieldArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
