// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firebase.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppState extends io.pulumi.resources.ResourceArgs {

    public static final WebAppState Empty = new WebAppState();

    /**
     * Immutable. The globally unique, Firebase-assigned identifier of the App. This identifier should be treated as an opaque
     * token, as the data format is not specified.
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> appId() {
        return this.appId == null ? Codegen.empty() : this.appId;
    }

    /**
     * The user-assigned display name of the App.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The fully qualified resource name of the App, for example: projects/projectId/webApps/appId
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public WebAppState(
        @Nullable Output<String> appId,
        @Nullable Output<String> displayName,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.appId = appId;
        this.displayName = displayName;
        this.name = name;
        this.project = project;
    }

    private WebAppState() {
        this.appId = Codegen.empty();
        this.displayName = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appId;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }
        public Builder appId(@Nullable String appId) {
            this.appId = Codegen.ofNullable(appId);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public WebAppState build() {
            return new WebAppState(appId, displayName, name, project);
        }
    }
}
