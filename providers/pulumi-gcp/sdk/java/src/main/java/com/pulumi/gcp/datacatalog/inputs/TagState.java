// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.TagFieldArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagState extends ResourceArgs {

    public static final TagState Empty = new TagState();

    /**
     * Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
     * individual column based on that schema.
     * For attaching a tag to a nested column, use `.` to separate the column names. Example:
     * `outer_column.inner_column`
     * 
     */
    @Import(name="column")
    private @Nullable Output<String> column;

    /**
     * @return Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
     * individual column based on that schema.
     * For attaching a tag to a nested column, use `.` to separate the column names. Example:
     * `outer_column.inner_column`
     * 
     */
    public Optional<Output<String>> column() {
        return Optional.ofNullable(this.column);
    }

    /**
     * This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @Import(name="fields")
    private @Nullable Output<List<TagFieldArgs>> fields;

    /**
     * @return This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<TagFieldArgs>>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * The resource name of the tag in URL format. Example:
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}/tags/{tag_id} or
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/tags/{tag_id} where tag_id is a system-generated
     * identifier. Note that this Tag may not actually be stored in the location in this name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the tag in URL format. Example:
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}/tags/{tag_id} or
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/tags/{tag_id} where tag_id is a system-generated
     * identifier. Note that this Tag may not actually be stored in the location in this name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
     * all entries in that group.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
     * all entries in that group.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    /**
     * The resource name of the tag template that this tag uses. Example:
     * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
     * This field cannot be modified after creation.
     * 
     */
    @Import(name="template")
    private @Nullable Output<String> template;

    /**
     * @return The resource name of the tag template that this tag uses. Example:
     * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
     * This field cannot be modified after creation.
     * 
     */
    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    /**
     * The display name of the tag template.
     * 
     */
    @Import(name="templateDisplayname")
    private @Nullable Output<String> templateDisplayname;

    /**
     * @return The display name of the tag template.
     * 
     */
    public Optional<Output<String>> templateDisplayname() {
        return Optional.ofNullable(this.templateDisplayname);
    }

    private TagState() {}

    private TagState(TagState $) {
        this.column = $.column;
        this.fields = $.fields;
        this.name = $.name;
        this.parent = $.parent;
        this.template = $.template;
        this.templateDisplayname = $.templateDisplayname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagState $;

        public Builder() {
            $ = new TagState();
        }

        public Builder(TagState defaults) {
            $ = new TagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param column Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
         * individual column based on that schema.
         * For attaching a tag to a nested column, use `.` to separate the column names. Example:
         * `outer_column.inner_column`
         * 
         * @return builder
         * 
         */
        public Builder column(@Nullable Output<String> column) {
            $.column = column;
            return this;
        }

        /**
         * @param column Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
         * individual column based on that schema.
         * For attaching a tag to a nested column, use `.` to separate the column names. Example:
         * `outer_column.inner_column`
         * 
         * @return builder
         * 
         */
        public Builder column(String column) {
            return column(Output.of(column));
        }

        /**
         * @param fields This maps the ID of a tag field to the value of and additional information about that field.
         * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable Output<List<TagFieldArgs>> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields This maps the ID of a tag field to the value of and additional information about that field.
         * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fields(List<TagFieldArgs> fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param fields This maps the ID of a tag field to the value of and additional information about that field.
         * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fields(TagFieldArgs... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param name The resource name of the tag in URL format. Example:
         * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}/tags/{tag_id} or
         * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/tags/{tag_id} where tag_id is a system-generated
         * identifier. Note that this Tag may not actually be stored in the location in this name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the tag in URL format. Example:
         * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}/tags/{tag_id} or
         * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/tags/{tag_id} where tag_id is a system-generated
         * identifier. Note that this Tag may not actually be stored in the location in this name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
         * all entries in that group.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
         * all entries in that group.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param template The resource name of the tag template that this tag uses. Example:
         * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
         * This field cannot be modified after creation.
         * 
         * @return builder
         * 
         */
        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        /**
         * @param template The resource name of the tag template that this tag uses. Example:
         * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
         * This field cannot be modified after creation.
         * 
         * @return builder
         * 
         */
        public Builder template(String template) {
            return template(Output.of(template));
        }

        /**
         * @param templateDisplayname The display name of the tag template.
         * 
         * @return builder
         * 
         */
        public Builder templateDisplayname(@Nullable Output<String> templateDisplayname) {
            $.templateDisplayname = templateDisplayname;
            return this;
        }

        /**
         * @param templateDisplayname The display name of the tag template.
         * 
         * @return builder
         * 
         */
        public Builder templateDisplayname(String templateDisplayname) {
            return templateDisplayname(Output.of(templateDisplayname));
        }

        public TagState build() {
            return $;
        }
    }

}
