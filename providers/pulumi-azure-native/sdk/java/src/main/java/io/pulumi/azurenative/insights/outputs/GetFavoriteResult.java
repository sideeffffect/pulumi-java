// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFavoriteResult {
    /**
     * Favorite category, as defined by the user at creation time.
     * 
     */
    private final @Nullable String category;
    /**
     * Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a string containing valid JSON
     * 
     */
    private final @Nullable String config;
    /**
     * Internally assigned unique id of the favorite definition.
     * 
     */
    private final String favoriteId;
    /**
     * Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    private final @Nullable String favoriteType;
    /**
     * Flag denoting wether or not this favorite was generated from a template.
     * 
     */
    private final @Nullable Boolean isGeneratedFromTemplate;
    /**
     * The user-defined name of the favorite.
     * 
     */
    private final @Nullable String name;
    /**
     * The source of the favorite definition.
     * 
     */
    private final @Nullable String sourceType;
    /**
     * A list of 0 or more tags that are associated with this favorite definition
     * 
     */
    private final @Nullable List<String> tags;
    /**
     * Date and time in UTC of the last modification that was made to this favorite definition.
     * 
     */
    private final String timeModified;
    /**
     * Unique user id of the specific user that owns this favorite.
     * 
     */
    private final String userId;
    /**
     * This instance's version of the data model. This can change as new features are added that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"category","config","favoriteId","favoriteType","isGeneratedFromTemplate","name","sourceType","tags","timeModified","userId","version"})
    private GetFavoriteResult(
        @Nullable String category,
        @Nullable String config,
        String favoriteId,
        @Nullable String favoriteType,
        @Nullable Boolean isGeneratedFromTemplate,
        @Nullable String name,
        @Nullable String sourceType,
        @Nullable List<String> tags,
        String timeModified,
        String userId,
        @Nullable String version) {
        this.category = category;
        this.config = config;
        this.favoriteId = favoriteId;
        this.favoriteType = favoriteType;
        this.isGeneratedFromTemplate = isGeneratedFromTemplate;
        this.name = name;
        this.sourceType = sourceType;
        this.tags = tags;
        this.timeModified = timeModified;
        this.userId = userId;
        this.version = version;
    }

    /**
     * Favorite category, as defined by the user at creation time.
     * 
    */
    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    /**
     * Configuration of this particular favorite, which are driven by the Azure portal UX. Configuration data is a string containing valid JSON
     * 
    */
    public Optional<String> getConfig() {
        return Optional.ofNullable(this.config);
    }
    /**
     * Internally assigned unique id of the favorite definition.
     * 
    */
    public String getFavoriteId() {
        return this.favoriteId;
    }
    /**
     * Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
    */
    public Optional<String> getFavoriteType() {
        return Optional.ofNullable(this.favoriteType);
    }
    /**
     * Flag denoting wether or not this favorite was generated from a template.
     * 
    */
    public Optional<Boolean> getIsGeneratedFromTemplate() {
        return Optional.ofNullable(this.isGeneratedFromTemplate);
    }
    /**
     * The user-defined name of the favorite.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The source of the favorite definition.
     * 
    */
    public Optional<String> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }
    /**
     * A list of 0 or more tags that are associated with this favorite definition
     * 
    */
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Date and time in UTC of the last modification that was made to this favorite definition.
     * 
    */
    public String getTimeModified() {
        return this.timeModified;
    }
    /**
     * Unique user id of the specific user that owns this favorite.
     * 
    */
    public String getUserId() {
        return this.userId;
    }
    /**
     * This instance's version of the data model. This can change as new features are added that can be marked favorite. Current examples include MetricsExplorer (ME) and Search.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFavoriteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private @Nullable String config;
        private String favoriteId;
        private @Nullable String favoriteType;
        private @Nullable Boolean isGeneratedFromTemplate;
        private @Nullable String name;
        private @Nullable String sourceType;
        private @Nullable List<String> tags;
        private String timeModified;
        private String userId;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFavoriteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.config = defaults.config;
    	      this.favoriteId = defaults.favoriteId;
    	      this.favoriteType = defaults.favoriteType;
    	      this.isGeneratedFromTemplate = defaults.isGeneratedFromTemplate;
    	      this.name = defaults.name;
    	      this.sourceType = defaults.sourceType;
    	      this.tags = defaults.tags;
    	      this.timeModified = defaults.timeModified;
    	      this.userId = defaults.userId;
    	      this.version = defaults.version;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder setConfig(@Nullable String config) {
            this.config = config;
            return this;
        }

        public Builder setFavoriteId(String favoriteId) {
            this.favoriteId = Objects.requireNonNull(favoriteId);
            return this;
        }

        public Builder setFavoriteType(@Nullable String favoriteType) {
            this.favoriteType = favoriteType;
            return this;
        }

        public Builder setIsGeneratedFromTemplate(@Nullable Boolean isGeneratedFromTemplate) {
            this.isGeneratedFromTemplate = isGeneratedFromTemplate;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetFavoriteResult build() {
            return new GetFavoriteResult(category, config, favoriteId, favoriteType, isGeneratedFromTemplate, name, sourceType, tags, timeModified, userId, version);
        }
    }
}
