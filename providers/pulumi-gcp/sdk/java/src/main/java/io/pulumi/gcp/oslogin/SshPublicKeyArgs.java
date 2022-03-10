// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.oslogin;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @InputImport(name="expirationTimeUsec")
      private final @Nullable Input<String> expirationTimeUsec;

    public Input<String> getExpirationTimeUsec() {
        return this.expirationTimeUsec == null ? Input.empty() : this.expirationTimeUsec;
    }

    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * The project ID of the Google Cloud Platform project.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The user email.
     * 
     */
    @InputImport(name="user", required=true)
      private final Input<String> user;

    public Input<String> getUser() {
        return this.user;
    }

    public SshPublicKeyArgs(
        @Nullable Input<String> expirationTimeUsec,
        Input<String> key,
        @Nullable Input<String> project,
        Input<String> user) {
        this.expirationTimeUsec = expirationTimeUsec;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.project = project;
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
    }

    private SshPublicKeyArgs() {
        this.expirationTimeUsec = Input.empty();
        this.key = Input.empty();
        this.project = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expirationTimeUsec;
        private Input<String> key;
        private @Nullable Input<String> project;
        private Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTimeUsec = defaults.expirationTimeUsec;
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.user = defaults.user;
        }

        public Builder expirationTimeUsec(@Nullable Input<String> expirationTimeUsec) {
            this.expirationTimeUsec = expirationTimeUsec;
            return this;
        }

        public Builder expirationTimeUsec(@Nullable String expirationTimeUsec) {
            this.expirationTimeUsec = Input.ofNullable(expirationTimeUsec);
            return this;
        }

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder user(Input<String> user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }

        public Builder user(String user) {
            this.user = Input.of(Objects.requireNonNull(user));
            return this;
        }
        public SshPublicKeyArgs build() {
            return new SshPublicKeyArgs(expirationTimeUsec, key, project, user);
        }
    }
}
