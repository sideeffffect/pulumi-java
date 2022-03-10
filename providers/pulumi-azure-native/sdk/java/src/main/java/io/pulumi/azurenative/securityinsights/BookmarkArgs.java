// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.inputs.IncidentInfoArgs;
import io.pulumi.azurenative.securityinsights.inputs.UserInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BookmarkArgs extends io.pulumi.resources.ResourceArgs {

    public static final BookmarkArgs Empty = new BookmarkArgs();

    /**
     * Bookmark ID
     * 
     */
    @InputImport(name="bookmarkId")
      private final @Nullable Input<String> bookmarkId;

    public Input<String> getBookmarkId() {
        return this.bookmarkId == null ? Input.empty() : this.bookmarkId;
    }

    /**
     * The time the bookmark was created
     * 
     */
    @InputImport(name="created")
      private final @Nullable Input<String> created;

    public Input<String> getCreated() {
        return this.created == null ? Input.empty() : this.created;
    }

    /**
     * Describes a user that created the bookmark
     * 
     */
    @InputImport(name="createdBy")
      private final @Nullable Input<UserInfoArgs> createdBy;

    public Input<UserInfoArgs> getCreatedBy() {
        return this.createdBy == null ? Input.empty() : this.createdBy;
    }

    /**
     * The display name of the bookmark
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The bookmark event time
     * 
     */
    @InputImport(name="eventTime")
      private final @Nullable Input<String> eventTime;

    public Input<String> getEventTime() {
        return this.eventTime == null ? Input.empty() : this.eventTime;
    }

    /**
     * Describes an incident that relates to bookmark
     * 
     */
    @InputImport(name="incidentInfo")
      private final @Nullable Input<IncidentInfoArgs> incidentInfo;

    public Input<IncidentInfoArgs> getIncidentInfo() {
        return this.incidentInfo == null ? Input.empty() : this.incidentInfo;
    }

    /**
     * List of labels relevant to this bookmark
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<List<String>> labels;

    public Input<List<String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The notes of the bookmark
     * 
     */
    @InputImport(name="notes")
      private final @Nullable Input<String> notes;

    public Input<String> getNotes() {
        return this.notes == null ? Input.empty() : this.notes;
    }

    /**
     * The query of the bookmark.
     * 
     */
    @InputImport(name="query", required=true)
      private final Input<String> query;

    public Input<String> getQuery() {
        return this.query;
    }

    /**
     * The end time for the query
     * 
     */
    @InputImport(name="queryEndTime")
      private final @Nullable Input<String> queryEndTime;

    public Input<String> getQueryEndTime() {
        return this.queryEndTime == null ? Input.empty() : this.queryEndTime;
    }

    /**
     * The query result of the bookmark.
     * 
     */
    @InputImport(name="queryResult")
      private final @Nullable Input<String> queryResult;

    public Input<String> getQueryResult() {
        return this.queryResult == null ? Input.empty() : this.queryResult;
    }

    /**
     * The start time for the query
     * 
     */
    @InputImport(name="queryStartTime")
      private final @Nullable Input<String> queryStartTime;

    public Input<String> getQueryStartTime() {
        return this.queryStartTime == null ? Input.empty() : this.queryStartTime;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The last time the bookmark was updated
     * 
     */
    @InputImport(name="updated")
      private final @Nullable Input<String> updated;

    public Input<String> getUpdated() {
        return this.updated == null ? Input.empty() : this.updated;
    }

    /**
     * Describes a user that updated the bookmark
     * 
     */
    @InputImport(name="updatedBy")
      private final @Nullable Input<UserInfoArgs> updatedBy;

    public Input<UserInfoArgs> getUpdatedBy() {
        return this.updatedBy == null ? Input.empty() : this.updatedBy;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public BookmarkArgs(
        @Nullable Input<String> bookmarkId,
        @Nullable Input<String> created,
        @Nullable Input<UserInfoArgs> createdBy,
        Input<String> displayName,
        @Nullable Input<String> eventTime,
        @Nullable Input<IncidentInfoArgs> incidentInfo,
        @Nullable Input<List<String>> labels,
        @Nullable Input<String> notes,
        Input<String> query,
        @Nullable Input<String> queryEndTime,
        @Nullable Input<String> queryResult,
        @Nullable Input<String> queryStartTime,
        Input<String> resourceGroupName,
        @Nullable Input<String> updated,
        @Nullable Input<UserInfoArgs> updatedBy,
        Input<String> workspaceName) {
        this.bookmarkId = bookmarkId;
        this.created = created;
        this.createdBy = createdBy;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.eventTime = eventTime;
        this.incidentInfo = incidentInfo;
        this.labels = labels;
        this.notes = notes;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.queryEndTime = queryEndTime;
        this.queryResult = queryResult;
        this.queryStartTime = queryStartTime;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private BookmarkArgs() {
        this.bookmarkId = Input.empty();
        this.created = Input.empty();
        this.createdBy = Input.empty();
        this.displayName = Input.empty();
        this.eventTime = Input.empty();
        this.incidentInfo = Input.empty();
        this.labels = Input.empty();
        this.notes = Input.empty();
        this.query = Input.empty();
        this.queryEndTime = Input.empty();
        this.queryResult = Input.empty();
        this.queryStartTime = Input.empty();
        this.resourceGroupName = Input.empty();
        this.updated = Input.empty();
        this.updatedBy = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BookmarkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bookmarkId;
        private @Nullable Input<String> created;
        private @Nullable Input<UserInfoArgs> createdBy;
        private Input<String> displayName;
        private @Nullable Input<String> eventTime;
        private @Nullable Input<IncidentInfoArgs> incidentInfo;
        private @Nullable Input<List<String>> labels;
        private @Nullable Input<String> notes;
        private Input<String> query;
        private @Nullable Input<String> queryEndTime;
        private @Nullable Input<String> queryResult;
        private @Nullable Input<String> queryStartTime;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> updated;
        private @Nullable Input<UserInfoArgs> updatedBy;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(BookmarkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bookmarkId = defaults.bookmarkId;
    	      this.created = defaults.created;
    	      this.createdBy = defaults.createdBy;
    	      this.displayName = defaults.displayName;
    	      this.eventTime = defaults.eventTime;
    	      this.incidentInfo = defaults.incidentInfo;
    	      this.labels = defaults.labels;
    	      this.notes = defaults.notes;
    	      this.query = defaults.query;
    	      this.queryEndTime = defaults.queryEndTime;
    	      this.queryResult = defaults.queryResult;
    	      this.queryStartTime = defaults.queryStartTime;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.updated = defaults.updated;
    	      this.updatedBy = defaults.updatedBy;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder bookmarkId(@Nullable Input<String> bookmarkId) {
            this.bookmarkId = bookmarkId;
            return this;
        }

        public Builder bookmarkId(@Nullable String bookmarkId) {
            this.bookmarkId = Input.ofNullable(bookmarkId);
            return this;
        }

        public Builder created(@Nullable Input<String> created) {
            this.created = created;
            return this;
        }

        public Builder created(@Nullable String created) {
            this.created = Input.ofNullable(created);
            return this;
        }

        public Builder createdBy(@Nullable Input<UserInfoArgs> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(@Nullable UserInfoArgs createdBy) {
            this.createdBy = Input.ofNullable(createdBy);
            return this;
        }

        public Builder displayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder eventTime(@Nullable Input<String> eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        public Builder eventTime(@Nullable String eventTime) {
            this.eventTime = Input.ofNullable(eventTime);
            return this;
        }

        public Builder incidentInfo(@Nullable Input<IncidentInfoArgs> incidentInfo) {
            this.incidentInfo = incidentInfo;
            return this;
        }

        public Builder incidentInfo(@Nullable IncidentInfoArgs incidentInfo) {
            this.incidentInfo = Input.ofNullable(incidentInfo);
            return this;
        }

        public Builder labels(@Nullable Input<List<String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable List<String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder notes(@Nullable Input<String> notes) {
            this.notes = notes;
            return this;
        }

        public Builder notes(@Nullable String notes) {
            this.notes = Input.ofNullable(notes);
            return this;
        }

        public Builder query(Input<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder query(String query) {
            this.query = Input.of(Objects.requireNonNull(query));
            return this;
        }

        public Builder queryEndTime(@Nullable Input<String> queryEndTime) {
            this.queryEndTime = queryEndTime;
            return this;
        }

        public Builder queryEndTime(@Nullable String queryEndTime) {
            this.queryEndTime = Input.ofNullable(queryEndTime);
            return this;
        }

        public Builder queryResult(@Nullable Input<String> queryResult) {
            this.queryResult = queryResult;
            return this;
        }

        public Builder queryResult(@Nullable String queryResult) {
            this.queryResult = Input.ofNullable(queryResult);
            return this;
        }

        public Builder queryStartTime(@Nullable Input<String> queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }

        public Builder queryStartTime(@Nullable String queryStartTime) {
            this.queryStartTime = Input.ofNullable(queryStartTime);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder updated(@Nullable Input<String> updated) {
            this.updated = updated;
            return this;
        }

        public Builder updated(@Nullable String updated) {
            this.updated = Input.ofNullable(updated);
            return this;
        }

        public Builder updatedBy(@Nullable Input<UserInfoArgs> updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder updatedBy(@Nullable UserInfoArgs updatedBy) {
            this.updatedBy = Input.ofNullable(updatedBy);
            return this;
        }

        public Builder workspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public BookmarkArgs build() {
            return new BookmarkArgs(bookmarkId, created, createdBy, displayName, eventTime, incidentInfo, labels, notes, query, queryEndTime, queryResult, queryStartTime, resourceGroupName, updated, updatedBy, workspaceName);
        }
    }
}
