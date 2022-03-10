// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.StatusCauseArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 * 
 */
public final class StatusDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusDetailsArgs Empty = new StatusDetailsArgs();

    /**
     * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
     * 
     */
    @InputImport(name="causes")
      private final @Nullable Input<List<StatusCauseArgs>> causes;

    public Input<List<StatusCauseArgs>> getCauses() {
        return this.causes == null ? Input.empty() : this.causes;
    }

    /**
     * The group attribute of the resource associated with the status StatusReason.
     * 
     */
    @InputImport(name="group")
      private final @Nullable Input<String> group;

    public Input<String> getGroup() {
        return this.group == null ? Input.empty() : this.group;
    }

    /**
     * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
     * 
     */
    @InputImport(name="retryAfterSeconds")
      private final @Nullable Input<Integer> retryAfterSeconds;

    public Input<Integer> getRetryAfterSeconds() {
        return this.retryAfterSeconds == null ? Input.empty() : this.retryAfterSeconds;
    }

    /**
     * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    public StatusDetailsArgs(
        @Nullable Input<List<StatusCauseArgs>> causes,
        @Nullable Input<String> group,
        @Nullable Input<String> kind,
        @Nullable Input<String> name,
        @Nullable Input<Integer> retryAfterSeconds,
        @Nullable Input<String> uid) {
        this.causes = causes;
        this.group = group;
        this.kind = kind;
        this.name = name;
        this.retryAfterSeconds = retryAfterSeconds;
        this.uid = uid;
    }

    private StatusDetailsArgs() {
        this.causes = Input.empty();
        this.group = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.retryAfterSeconds = Input.empty();
        this.uid = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<StatusCauseArgs>> causes;
        private @Nullable Input<String> group;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> retryAfterSeconds;
        private @Nullable Input<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.causes = defaults.causes;
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.retryAfterSeconds = defaults.retryAfterSeconds;
    	      this.uid = defaults.uid;
        }

        public Builder causes(@Nullable Input<List<StatusCauseArgs>> causes) {
            this.causes = causes;
            return this;
        }

        public Builder causes(@Nullable List<StatusCauseArgs> causes) {
            this.causes = Input.ofNullable(causes);
            return this;
        }

        public Builder group(@Nullable Input<String> group) {
            this.group = group;
            return this;
        }

        public Builder group(@Nullable String group) {
            this.group = Input.ofNullable(group);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder retryAfterSeconds(@Nullable Input<Integer> retryAfterSeconds) {
            this.retryAfterSeconds = retryAfterSeconds;
            return this;
        }

        public Builder retryAfterSeconds(@Nullable Integer retryAfterSeconds) {
            this.retryAfterSeconds = Input.ofNullable(retryAfterSeconds);
            return this;
        }

        public Builder uid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder uid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }
        public StatusDetailsArgs build() {
            return new StatusDetailsArgs(causes, group, kind, name, retryAfterSeconds, uid);
        }
    }
}
