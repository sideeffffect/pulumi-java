// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryGroupState extends ResourceArgs {

    public static final EntryGroupState Empty = new EntryGroupState();

    /**
     * Entry group description, which can consist of several sentences or paragraphs that describe entry group contents.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Entry group description, which can consist of several sentences or paragraphs that describe entry group contents.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A short name to identify the entry group, for example, &#34;analytics data - jan 2011&#34;.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A short name to identify the entry group, for example, &#34;analytics data - jan 2011&#34;.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The id of the entry group to create. The id must begin with a letter or underscore,
     * contain only English letters, numbers and underscores, and be at most 64 characters.
     * 
     */
    @Import(name="entryGroupId")
    private @Nullable Output<String> entryGroupId;

    /**
     * @return The id of the entry group to create. The id must begin with a letter or underscore,
     * contain only English letters, numbers and underscores, and be at most 64 characters.
     * 
     */
    public Optional<Output<String>> entryGroupId() {
        return Optional.ofNullable(this.entryGroupId);
    }

    /**
     * The resource name of the entry group in URL format. Example:
     * projects/{project}/locations/{location}/entryGroups/{entryGroupId}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the entry group in URL format. Example:
     * projects/{project}/locations/{location}/entryGroups/{entryGroupId}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * EntryGroup location region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return EntryGroup location region.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private EntryGroupState() {}

    private EntryGroupState(EntryGroupState $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.entryGroupId = $.entryGroupId;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryGroupState $;

        public Builder() {
            $ = new EntryGroupState();
        }

        public Builder(EntryGroupState defaults) {
            $ = new EntryGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Entry group description, which can consist of several sentences or paragraphs that describe entry group contents.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Entry group description, which can consist of several sentences or paragraphs that describe entry group contents.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A short name to identify the entry group, for example, &#34;analytics data - jan 2011&#34;.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A short name to identify the entry group, for example, &#34;analytics data - jan 2011&#34;.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param entryGroupId The id of the entry group to create. The id must begin with a letter or underscore,
         * contain only English letters, numbers and underscores, and be at most 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder entryGroupId(@Nullable Output<String> entryGroupId) {
            $.entryGroupId = entryGroupId;
            return this;
        }

        /**
         * @param entryGroupId The id of the entry group to create. The id must begin with a letter or underscore,
         * contain only English letters, numbers and underscores, and be at most 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder entryGroupId(String entryGroupId) {
            return entryGroupId(Output.of(entryGroupId));
        }

        /**
         * @param name The resource name of the entry group in URL format. Example:
         * projects/{project}/locations/{location}/entryGroups/{entryGroupId}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the entry group in URL format. Example:
         * projects/{project}/locations/{location}/entryGroups/{entryGroupId}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region EntryGroup location region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region EntryGroup location region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public EntryGroupState build() {
            return $;
        }
    }

}
