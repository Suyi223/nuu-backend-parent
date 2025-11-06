
## 项目模块划分

    nuu-backend-parent/             # 项目模块父级
        ├‌‌─‌ nuu-dependencies         # 统一管理项目依赖及版本
        ├‌‌─‌ nuu-common               # 通用工具与通用逻辑
        │    ├‌‌─‌ nuu-common-api      # 各模块数据相互调用
        │    ├‌‌─‌ nuu-common-utils    # 工具模块
        ├‌‌─‌ nuu-framework            # 基础支撑框架层（安全认证、日志、全局异常处理等）
        ├‌‌─‌ nuu-system               # 系统管理模块
        │    ├‌‌─‌ nuu-system-user     # 用户模块（个人资料、设置等）
        │    ├‌‌─‌ nuu-system-file     # 文件管理模块（已上传文件管理等）
        │    ‌└‌‌─ nuu-system-admin    # 管理员模块（角色、权限、菜单等各项系统配置）
        ‌└‌‌─‌ nuu-app-server           # 启动模块（SpringBoot3.5.7）