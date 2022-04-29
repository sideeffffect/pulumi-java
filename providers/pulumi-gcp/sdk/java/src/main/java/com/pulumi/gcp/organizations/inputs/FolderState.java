// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderState extends ResourceArgs {

    public static final FolderState Empty = new FolderState();

    /**
     * Timestamp when the Folder was created. Assigned by the server.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Timestamp when the Folder was created. Assigned by the server.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The folder’s display name.
     * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The folder’s display name.
     * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The folder id from the name &#34;folders/{folder_id}&#34;
     * 
     */
    @Import(name="folderId")
    private @Nullable Output<String> folderId;

    /**
     * @return The folder id from the name &#34;folders/{folder_id}&#34;
     * 
     */
    public Optional<Output<String>> folderId() {
        return Optional.ofNullable(this.folderId);
    }

    /**
     * The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
     * 
     */
    @Import(name="lifecycleState")
    private @Nullable Output<String> lifecycleState;

    /**
     * @return The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
     * 
     */
    public Optional<Output<String>> lifecycleState() {
        return Optional.ofNullable(this.lifecycleState);
    }

    /**
     * The resource name of the Folder. Its format is folders/{folder_id}.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the Folder. Its format is folders/{folder_id}.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource name of the parent Folder or Organization.
     * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The resource name of the parent Folder or Organization.
     * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    private FolderState() {}

    private FolderState(FolderState $) {
        this.createTime = $.createTime;
        this.displayName = $.displayName;
        this.folderId = $.folderId;
        this.lifecycleState = $.lifecycleState;
        this.name = $.name;
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderState $;

        public Builder() {
            $ = new FolderState();
        }

        public Builder(FolderState defaults) {
            $ = new FolderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Timestamp when the Folder was created. Assigned by the server.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Timestamp when the Folder was created. Assigned by the server.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param displayName The folder’s display name.
         * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The folder’s display name.
         * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param folderId The folder id from the name &#34;folders/{folder_id}&#34;
         * 
         * @return builder
         * 
         */
        public Builder folderId(@Nullable Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        /**
         * @param folderId The folder id from the name &#34;folders/{folder_id}&#34;
         * 
         * @return builder
         * 
         */
        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        /**
         * @param lifecycleState The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleState(@Nullable Output<String> lifecycleState) {
            $.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * @param lifecycleState The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleState(String lifecycleState) {
            return lifecycleState(Output.of(lifecycleState));
        }

        /**
         * @param name The resource name of the Folder. Its format is folders/{folder_id}.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the Folder. Its format is folders/{folder_id}.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The resource name of the parent Folder or Organization.
         * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The resource name of the parent Folder or Organization.
         * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public FolderState build() {
            return $;
        }
    }

}
