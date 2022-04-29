// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * A user-assigned name for this group, used only for display
     * purposes.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-assigned name for this group, used only for display
     * purposes.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The filter used to determine which monitored resources
     * belong to this group.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return The filter used to determine which monitored resources
     * belong to this group.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * If true, the members of this group are considered to be a
     * cluster. The system can perform additional analysis on
     * groups that are clusters.
     * 
     */
    @Import(name="isCluster")
    private @Nullable Output<Boolean> isCluster;

    /**
     * @return If true, the members of this group are considered to be a
     * cluster. The system can perform additional analysis on
     * groups that are clusters.
     * 
     */
    public Optional<Output<Boolean>> isCluster() {
        return Optional.ofNullable(this.isCluster);
    }

    /**
     * A unique identifier for this group. The format is &#34;projects/{project_id_or_number}/groups/{group_id}&#34;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique identifier for this group. The format is &#34;projects/{project_id_or_number}/groups/{group_id}&#34;.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the group&#39;s parent, if it has one. The format is
     * &#34;projects/{project_id_or_number}/groups/{group_id}&#34;. For
     * groups with no parent, parentName is the empty string, &#34;&#34;.
     * 
     */
    @Import(name="parentName")
    private @Nullable Output<String> parentName;

    /**
     * @return The name of the group&#39;s parent, if it has one. The format is
     * &#34;projects/{project_id_or_number}/groups/{group_id}&#34;. For
     * groups with no parent, parentName is the empty string, &#34;&#34;.
     * 
     */
    public Optional<Output<String>> parentName() {
        return Optional.ofNullable(this.parentName);
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

    private GroupState() {}

    private GroupState(GroupState $) {
        this.displayName = $.displayName;
        this.filter = $.filter;
        this.isCluster = $.isCluster;
        this.name = $.name;
        this.parentName = $.parentName;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A user-assigned name for this group, used only for display
         * purposes.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-assigned name for this group, used only for display
         * purposes.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param filter The filter used to determine which monitored resources
         * belong to this group.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter The filter used to determine which monitored resources
         * belong to this group.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param isCluster If true, the members of this group are considered to be a
         * cluster. The system can perform additional analysis on
         * groups that are clusters.
         * 
         * @return builder
         * 
         */
        public Builder isCluster(@Nullable Output<Boolean> isCluster) {
            $.isCluster = isCluster;
            return this;
        }

        /**
         * @param isCluster If true, the members of this group are considered to be a
         * cluster. The system can perform additional analysis on
         * groups that are clusters.
         * 
         * @return builder
         * 
         */
        public Builder isCluster(Boolean isCluster) {
            return isCluster(Output.of(isCluster));
        }

        /**
         * @param name A unique identifier for this group. The format is &#34;projects/{project_id_or_number}/groups/{group_id}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique identifier for this group. The format is &#34;projects/{project_id_or_number}/groups/{group_id}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentName The name of the group&#39;s parent, if it has one. The format is
         * &#34;projects/{project_id_or_number}/groups/{group_id}&#34;. For
         * groups with no parent, parentName is the empty string, &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder parentName(@Nullable Output<String> parentName) {
            $.parentName = parentName;
            return this;
        }

        /**
         * @param parentName The name of the group&#39;s parent, if it has one. The format is
         * &#34;projects/{project_id_or_number}/groups/{group_id}&#34;. For
         * groups with no parent, parentName is the empty string, &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder parentName(String parentName) {
            return parentName(Output.of(parentName));
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

        public GroupState build() {
            return $;
        }
    }

}
